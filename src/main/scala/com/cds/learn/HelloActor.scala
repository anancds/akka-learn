package com.cds.learn

import akka.actor.{Actor, ActorSystem, Props}

class HelloActor extends Actor {

  def receive = {
    case "hello" => println("hello")
    case _ => println("nin shi ?")
  }
}

object Main extends App {
  val system = ActorSystem("HelloSystem")

  val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")

  helloActor ! "hello"
//  helloActor ! "en"
}

