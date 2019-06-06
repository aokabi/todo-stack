package com.github.aokabi.app

import org.scalatra._

class TaskServlet extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }
  get("/tasks") {
    views.html.tasks()
  }

}
