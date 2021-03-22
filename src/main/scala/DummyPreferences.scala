package org.nlogo

import java.util.prefs.AbstractPreferences

class DummyPreferences() extends AbstractPreferences(null, "") {
  override def childSpi(x$1: String): AbstractPreferences = this
  override def childrenNamesSpi(): Array[String] = Array()
  override def flushSpi(): Unit = {}
  override def getSpi(x$1: String): String = null
  override def keysSpi(): Array[String] = Array()
  override def putSpi(x$1: String, x$2: String): Unit = {}
  override def removeNodeSpi(): Unit = {}
  override def removeSpi(x$1: String): Unit = {}
  override def syncSpi(): Unit = {}
}
