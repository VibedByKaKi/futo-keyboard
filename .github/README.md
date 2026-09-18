# VibedByKaKi/futo-keyboard

Personal fork of [FUTO Keyboard](https://github.com/futo-org/android-keyboard) on the [`dev`](https://github.com/VibedByKaKi/futo-keyboard/tree/dev) branch. It tracks upstream and adds fixes for issues I care about that are not yet merged upstream.

The upstream project README is still in [README.md](../README.md) at the repository root.

## Get the app

[![Get it on GitHub](https://img.shields.io/badge/Get%20it%20on-GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/VibedByKaKi/futo-keyboard/releases)
[![Get it on Obtainium](https://raw.githubusercontent.com/ImranR98/Obtainium/main/assets/graphics/badge_obtainium.png)](https://apps.obtainium.imranr.dev/redirect.html?r=obtainium://add/https://github.com/VibedByKaKi/futo-keyboard)

Builds are unsigned unstable debug APKs published as GitHub prereleases from the **Release prerelease APK** workflow. In Obtainium, enable **Include prereleases** when adding this repository.

Latest CI artifacts from pushes to `dev` are also available under [Actions](https://github.com/VibedByKaKi/futo-keyboard/actions/workflows/build-apk.yml).

## Exclusive fixes on `dev`

| Fix | Upstream issue | Commit on `dev` |
| --- | --- | --- |
| Toggle autocorrect from the action bar, with on/off icon state | [futo-org/android-keyboard#159](https://github.com/futo-org/android-keyboard/issues/159) | [`0fdfcfd`](https://github.com/VibedByKaKi/futo-keyboard/commit/0fdfcfd79c8954890432ac437e2d6311e0e5695a) |
| Optional setting to disable capitalization after a single-letter word and period (e.g. `i.`) | [futo-org/android-keyboard#1929](https://github.com/futo-org/android-keyboard/issues/1929) | [`bba150f`](https://github.com/VibedByKaKi/futo-keyboard/commit/bba150fdf9bbaf91dfb5e125e227a91e6b8f3e2a) |
| Spacebar cursor-move haptics on ROMs without `TEXT_HANDLE_MOVE` | [futo-org/android-keyboard#2008](https://github.com/futo-org/android-keyboard/issues/2008) | [`cfbc2ea`](https://github.com/VibedByKaKi/futo-keyboard/commit/cfbc2ea600a2fc28aa8865268834a82e1cc92b3a) |
| Preserve newlines when recapitalizing selected text | [futo-org/android-keyboard#1748](https://github.com/futo-org/android-keyboard/issues/1748) | [`b0827c1`](https://github.com/VibedByKaKi/futo-keyboard/commit/b0827c17bb044ab8da5ccf8fd21eabbf01ac6700) |

## CI

- **Build APK** — runs on every push and on manual dispatch; uploads `keyboard-unstable-debug-<build-number>.apk`.
- **Release prerelease APK** — manual only on `dev`; builds the APK and publishes a GitHub prerelease.
