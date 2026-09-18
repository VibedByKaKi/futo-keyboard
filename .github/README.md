# VibedByKaKi/futo-keyboard

Personal fork of [FUTO Keyboard](https://github.com/futo-org/android-keyboard) on the [`dev`](https://github.com/VibedByKaKi/futo-keyboard/tree/dev) branch. It tracks upstream and adds fixes for issues I care about that are not yet merged upstream.

The upstream project README is still in [README.md](../README.md) at the repository root.

| [![](assets/get-it-on-github.png)](https://github.com/VibedByKaKi/futo-keyboard/releases) | [![](assets/badge_obtainium.png)](https://apps.obtainium.imranr.dev/redirect?r=obtainium%3A%2F%2Fapp%2F%257B%2522id%2522%253A%2522org.futo.inputmethod.latin.unstable%2522%252C%2522url%2522%253A%2522https%253A%2F%2Fgithub.com%2FVibedByKaKi%2Ffuto-keyboard%2522%252C%2522author%2522%253A%2522VibedByKaKi%2522%252C%2522name%2522%253A%2522FUTO%2520Keyboard%2520%2528VibedByKaKi%2520fork%2529%2522%252C%2522preferredApkIndex%2522%253A0%252C%2522additionalSettings%2522%253A%2522%257B%255C%2522includePrereleases%255C%2522%253A%2520true%252C%2520%255C%2522fallbackToOlderReleases%255C%2522%253A%2520true%252C%2520%255C%2522apkFilterRegEx%255C%2522%253A%2520%255C%2522.%252A%255C%255C%255C%255C.apk%2524%255C%2522%257D%2522%257D)
| --- | ---

Builds are unsigned unstable debug APKs published as GitHub prereleases from the **Release prerelease APK** workflow. In Obtainium, keep **Include pre-releases** on if you added the repo by hand.

Latest CI artifacts from pushes to `dev` are also available under [Actions](https://github.com/VibedByKaKi/futo-keyboard/actions/workflows/build-apk.yml).

## Exclusive fixes on `dev`

| Fix | Upstream issue | Commit |
| --- | --- | --- |
| Toggle autocorrect from the action bar, with on/off icon state | [futo-org/android-keyboard#159](https://github.com/futo-org/android-keyboard/issues/159) | [`0fdfcfd`](https://github.com/VibedByKaKi/futo-keyboard/commit/0fdfcfd79c8954890432ac437e2d6311e0e5695a) |
| Optional setting to disable capitalization after a single-letter word and period (e.g. `i.e.`) | [futo-org/android-keyboard#1929](https://github.com/futo-org/android-keyboard/issues/1929) | [`bba150f`](https://github.com/VibedByKaKi/futo-keyboard/commit/bba150fdf9bbaf91dfb5e125e227a91e6b8f3e2a) |
| Spacebar cursor-move haptics on ROMs without `TEXT_HANDLE_MOVE` | [futo-org/android-keyboard#2008](https://github.com/futo-org/android-keyboard/issues/2008) | [`cfbc2ea`](https://github.com/VibedByKaKi/futo-keyboard/commit/cfbc2ea600a2fc28aa8865268834a82e1cc92b3a) |
| Preserve newlines when recapitalizing selected text | [futo-org/android-keyboard#1748](https://github.com/futo-org/android-keyboard/issues/1748) | [`b0827c1`](https://github.com/VibedByKaKi/futo-keyboard/commit/b0827c17bb044ab8da5ccf8fd21eabbf01ac6700) |

## CI

- **Build APK** — runs on every push and on manual dispatch; uploads `keyboard-unstable-debug-<build-number>.apk`.
- **Release prerelease APK** — manual only on `dev`; builds the APK and publishes a GitHub prerelease.
