@echo off
if [%ERRORLEVEL%] neq [0] exit /b %ERRORLEVEL%
call readProps.cmd deploy.properties
call readProps.cmd ../panopset/appwin.properties
set R=%USERPROFILE%\.m2\repository
set MP=^
%R%/org/jetbrains/kotlin/kotlin-stdlib/%KV%/kotlin-stdlib-%KV%.jar;^
%R%/org/jetbrains/kotlin/kotlin-reflect/%KV%/kotlin-reflect-%KV%.jar;^
%R%/org/openjfx/javafx-base/%FXV%/javafx-base-%FXV%-%FX_ARCH%.jar;^
%R%/org/openjfx/javafx-graphics/%FXV%/javafx-graphics-%FXV%-%FX_ARCH%.jar;^
%R%/org/openjfx/javafx-controls/%FXV%/javafx-controls-%FXV%-%FX_ARCH%.jar;^
%R%/org/openjfx/javafx-web/%FXV%/javafx-web-%FXV%-%FX_ARCH%.jar;^
%R%/org/openjfx/javafx-media/%FXV%/javafx-media-%FXV%-%FX_ARCH%.jar;^
%R%/com/fasterxml/jackson/core/jackson-annotations/%JA%/jackson-annotations-%JA%.jar;^
%R%/tools/jackson/core/jackson-core/%JV%/jackson-core-%JV%.jar;^
%R%/tools/jackson/core/jackson-databind/%JV%/jackson-databind-%JV%.jar;^
%R%/com/github/mwiede/jsch/%SV%/jsch-%SV%.jar;^
%R%/com/panopset/compat/%PV%/compat-%PV%.jar;^
%R%/com/panopset/desk/%PV%/desk-%PV%.jar;^
%R%/com/panopset/flywheel/%PV%/flywheel-%PV%.jar;^
%R%/com/panopset/fxapp/%PV%/fxapp-%PV%.jar;^
%R%/com/panopset/fsbengine/%PV%/fsbengine-%PV%.jar;^
%R%/com/panopset/fsbdesk/%PV%/fsbdesk-%PV%.jar

set c=jpackage ^
  -n fas21 ^
  -p %MP%;%JAVA_HOME%\jmods ^
  -m com.panopset.fsb.fsbdesk.games/com.panopset.fsb.fsbdesk.games.Blackjack ^
  --vendor "Panopset" ^
  --copyright "1996-2026 Karl Dinwiddie" ^
  --license-file LICENSE ^
  --description "Fas21 blackjack trainer." ^
  --add-launcher gi=launchers/gi.properties ^
  --app-version %PV% ^
  --dest target/installer ^
  --win-dir-chooser ^
  --win-console ^
  --type msi
%c%

set c=jpackage ^
  -n fas21 ^
  -p %MP%;%JAVA_HOME%\jmods ^
  -m com.panopset.fsb.fsbdesk.games/com.panopset.fsb.fsbdesk.games.Blackjack ^
  --vendor "Panopset" ^
  --copyright "1996-2026 Karl Dinwiddie" ^
  --description "Fas21 blackjack trainer." ^
  --add-launcher gi=launchers/gi.properties ^
  --app-version %PV% ^
  --dest target/standalone ^
  --win-console ^
  --type app-image
%c%

target\standalone\fas21\gi.exe appwin