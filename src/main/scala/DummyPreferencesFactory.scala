package org.nlogo

import java.util.prefs.{ Preferences, PreferencesFactory }

class DummyPreferencesFactory extends PreferencesFactory {
  private val dummy = new DummyPreferences()
  def systemRoot(): Preferences = dummy
  def userRoot(): Preferences = dummy
}
