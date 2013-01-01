package sprayelbtest

import spray.routing.SimpleRoutingApp

object Main extends App with SimpleRoutingApp {
  startServer(interface = "0.0.0.0", port = 8080) {
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
