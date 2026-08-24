/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.chumian.ime.utils;

import com.chumian.ime.settings.AdvancedSettingsFragment;
import com.chumian.ime.settings.AppearanceSettingsFragment;
import com.chumian.ime.settings.CorrectionSettingsFragment;
import com.chumian.ime.settings.CustomInputStyleSettingsFragment;
import com.chumian.ime.settings.DebugSettingsFragment;
import com.chumian.ime.settings.GestureSettingsFragment;
import com.chumian.ime.settings.PreferencesSettingsFragment;
import com.chumian.ime.settings.SettingsFragment;
import com.chumian.ime.spellcheck.SpellCheckerSettingsFragment;
import com.chumian.ime.userdictionary.UserDictionaryAddWordFragment;
import com.chumian.ime.userdictionary.UserDictionaryList;
import com.chumian.ime.userdictionary.UserDictionaryLocalePicker;
import com.chumian.ime.userdictionary.UserDictionarySettings;

import java.util.HashSet;

public class FragmentUtils {
    private static final HashSet<String> sLatinImeFragments = new HashSet<>();
    static {
        sLatinImeFragments.add(PreferencesSettingsFragment.class.getName());
        sLatinImeFragments.add(AppearanceSettingsFragment.class.getName());
        sLatinImeFragments.add(CustomInputStyleSettingsFragment.class.getName());
        sLatinImeFragments.add(GestureSettingsFragment.class.getName());
        sLatinImeFragments.add(CorrectionSettingsFragment.class.getName());
        sLatinImeFragments.add(AdvancedSettingsFragment.class.getName());
        sLatinImeFragments.add(DebugSettingsFragment.class.getName());
        sLatinImeFragments.add(SettingsFragment.class.getName());
        sLatinImeFragments.add(SpellCheckerSettingsFragment.class.getName());
        sLatinImeFragments.add(UserDictionaryAddWordFragment.class.getName());
        sLatinImeFragments.add(UserDictionaryList.class.getName());
        sLatinImeFragments.add(UserDictionaryLocalePicker.class.getName());
        sLatinImeFragments.add(UserDictionarySettings.class.getName());
    }

    public static boolean isValidFragment(String fragmentName) {
        return sLatinImeFragments.contains(fragmentName);
    }
}
