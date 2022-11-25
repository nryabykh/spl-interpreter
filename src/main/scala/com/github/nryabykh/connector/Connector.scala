package com.github.nryabykh.connector
import com.github.nryabykh.connector.Core.ConnectionInfo
import com.github.nryabykh.connector.utils.ApiPaths.authPath
import com.github.nryabykh.connector.utils.Exceptions.AuthException
import sttp.client3._

import scala.util.{Failure, Success, Try}

case class Connector(connInfo: ConnectionInfo, username: String, password: String) {
  private val authData = s"""{"username": "$username", "password": "$password"}"""

  val sessionKey: String = {
    ""
  }
}