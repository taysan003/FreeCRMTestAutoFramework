SET dir=c:\WebServers\SeleniumGridPort4444Port5559
ECHO %dir%
IF EXIST "%dir%\selenium-server-standalone-3.14.0.jar" (
    ECHO Selenium jar is exist at location : %dir%\selenium-server-standalone-3.14.0.jar
) ELSE (
    mkdir %dir%
    bitsadmin.exe /transfer "SeleniumGridPort4444Port5559" https://selenium-release.storage.googleapis.com/3.14/selenium-server-standalone-3.14.0.jar %dir%\selenium-server-standalone-3.14.0.jar
)

ECHO %dir% Directory is Created & All utilities are configured
start cmd.exe /k "cd /d %dir% && java -jar selenium-server-standalone-3.14.0.jar -role hub -maxSession 100"
