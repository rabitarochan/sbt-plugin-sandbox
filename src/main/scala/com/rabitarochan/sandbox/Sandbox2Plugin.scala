package com.rabitarochan

import sbt._
import sbt.Keys._

object Sandbox2Keys {

  lazy val sandbox = InputKey[Unit]( "sandbox2", "<arguments>" )

}

object Sandbox2Plugin extends Plugin {

  import Sandbox2Keys._

  lazy val sandbox2Settings = Seq(
    sandbox <<= inputTask { argTask: TaskKey[Seq[String]] => 
      ( argTask ) map { args => 
        println( "sandbox2 args:" )
        args zip (1 to args.length) foreach { case ( arg, idx ) => 
          println( "  %d: %s" format( idx, arg ) )
        }
      }
    }
  )

}
