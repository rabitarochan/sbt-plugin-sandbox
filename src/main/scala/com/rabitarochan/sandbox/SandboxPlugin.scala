package com.rabitarochan

import sbt._

object SandboxPlugin extends Plugin {
  override lazy val settings = Seq( Keys.commands += command )
  
  def command = Command.args( "sandbox", "<arguments>" ) { ( state, args ) =>
    println( "sandbox: " )
    args.zip( 1 to args.length ).foreach { case ( arg, idx ) =>
      println( "  %d: %s".format( idx, arg ) )
    }
    
    state
  }
}
