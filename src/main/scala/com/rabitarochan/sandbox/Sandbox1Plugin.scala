package com.rabitarochan

import sbt._
import sbt.Keys._

object Sandbox1Plugin extends Plugin {
  override lazy val settings = Seq( Keys.commands += command )
  
  def command = Command.args( "sandbox1", "<arguments>" ) { ( state, args ) =>
    println( "sandbox1: " )
    args.zip( 1 to args.length ).foreach { case ( arg, idx ) =>
      println( "  %d: %s".format( idx, arg ) )
    }
    
    state
  }
}
