package sprayelbtest

import spray.routing.SimpleRoutingApp

object Main extends App with SimpleRoutingApp {
  startServer(interface = "localhost", port = 8080) {
    get {
      path("ping") {
        complete {
          "pong"
        }
      } ~ 
      path("healthcheck") {
        complete {
          "healthy"
        }
      }
    }
  }
}
