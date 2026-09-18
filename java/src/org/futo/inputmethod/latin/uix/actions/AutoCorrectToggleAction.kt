package org.futo.inputmethod.latin.uix.actions

import org.futo.inputmethod.latin.R
import org.futo.inputmethod.latin.settings.Settings
import org.futo.inputmethod.latin.uix.Action
import org.futo.inputmethod.latin.uix.PreferenceUtils

val AutoCorrectToggleAction = Action(
    icon = R.drawable.icon_spellcheck,
    name = R.string.toggle_autocorrect,
    simplePressImpl = { manager, _ ->
        val context = manager.getContext()
        val prefs = PreferenceUtils.getDefaultSharedPreferences(context)
        val enabled = prefs.getBoolean(Settings.PREF_AUTO_CORRECTION, true)
        prefs.edit().putBoolean(Settings.PREF_AUTO_CORRECTION, !enabled).apply()
        manager.announce(
            context.getString(
                if (!enabled) {
                    R.string.toggle_autocorrect_enabled
                } else {
                    R.string.toggle_autocorrect_disabled
                }
            )
        )
    },
    windowImpl = null,
)
