SET dir=c:\WebServers\SeleniumGridPort4444Port5559\
ECHO %dir%
IF EXIST "%dir%\selenium-server-standalone-3.14.0.jar" (
    ECHO Selenium jar is exist at location : %dir%\selenium-server-standalone-3.14.0.jar
) ELSE (
    mkdir %dir%
	bitsadmin.exe /transfer "Download SeleniumGrid" https://selenium-release.storage.googleapis.com/3.14/selenium-server-standalone-3.14.0.jar %dir%\selenium-server-standalone-3.14.0.jar
)

ECHO %dir% -Directory is Created & All utilities are configured
start cmd.exe /k "cd /d %dir% && java -Dwebdriver.chrome.driver=^"c:\webdrivers\chromedriver.exe^" -Dwebdriver.ie.driver=^"c:\webdrivers\IEDriverServer.exe^" -Dwebdriver.edge.driver=^"c:\webdrivers\MicrosoftWebDriver.exe^" -Dwebdriver.gecko.driver=^"c:\webdrivers\geckodriver.exe^" -jar selenium-server-standalone-3.14.0.jar -role webdriver -hub http://192.168.1.18:4444/grid/register -port 5559"