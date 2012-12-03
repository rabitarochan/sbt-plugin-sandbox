import sbt._

object Sandbox3Plugin extends Plugin {

  val sandbox3 = InputKey[Unit]( "sandbox3", "<arguments>" )

  lazy val sandbox3Settings = Seq(
    sandbox3 <<= inputTask( sandbox3Task )
  )

  lazy val sandbox3Task = ( args: TaskKey[Seq[String]] ) => ( args ) map { 
    ( args: Seq[String] ) => {
      println( "sandbox3 args:" )
      args zip (1 to args.length) foreach { case ( arg, idx ) => 
        println( "  %d: %s" format( idx, arg ) )
      }
    }
  }

}
