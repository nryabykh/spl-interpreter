package com.github.nryabykh.connector

object Core {
  case class ConnectionInfo(host: String, port: Int, ssl: Boolean) {
    val protocol: String = if (ssl) "https" else "http"
    val path: String = s"$protocol://$host:$port"
    val pathHostOnly: STring = s"$protocol://$host"
  }

}
