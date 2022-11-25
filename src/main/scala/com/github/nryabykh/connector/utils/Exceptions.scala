package com.github.nryabykh.connector.utils

object Exceptions {
  class AuthException(msg: String) extends Exception(msg)
  class QueryExecutionException(msg: String) extends Exception(msg)
}
