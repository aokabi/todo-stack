package com.github.aokabi.app

import org.scalatra.test.scalatest._

class TaskServletTests extends ScalatraFunSuite {

  addServlet(classOf[TaskServlet], "/*")

  test("GET / on TaskServlet should return status 200") {
    get("/") {
      status should equal (200)
    }
  }

}
