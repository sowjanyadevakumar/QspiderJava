# Java Selenium Programs

Java programs covering Selenium WebDriver concepts using real websites (Flipkart, Amazon, IRCTC, Facebook, Instagram).

> **Note:** Requires Selenium Java JARs and browser drivers (ChromeDriver, GeckoDriver, EdgeDriver) on your classpath.

## Programs

### Selenium Tools
| File | Topic |
|------|-------|
| P01_SeleniumToolsOverview | Selenium IDE, WebDriver, Grid overview + launch Flipkart |
| P02_WebDriverSetup | ChromeDriver setup with ChromeOptions, launch Amazon |

### WebDriver Class Diagram
| File | Topic |
|------|-------|
| P03_WebDriverInterfaceMethods | WebDriver interface methods: get, title, URL, handle, quit |
| P04_MultipleDriverTypes | Chrome + Firefox drivers, WebDriver hierarchy on IRCTC |

### WebDriver Architecture with Multiple Browsers
| File | Topic |
|------|-------|
| P05_ChromeOptions | ChromeOptions: incognito, notifications, maximized on Flipkart |
| P06_FirefoxOptions | FirefoxOptions: private mode, Firefox profile preferences on Amazon |
| P07_EdgeBrowserControl | EdgeDriver: inprivate mode, cross-browser driver summary on IRCTC |

### Browser Control
| File | Topic |
|------|-------|
| P08_BrowserNavigation | get(), navigate().to/back/forward/refresh on Flipkart, Amazon, IRCTC |
| P09_WindowManagement | maximize, minimize, fullscreen, setSize, setPosition on Amazon |
| P10_MultipleWindowsAndTabs | New tabs/windows, switchTo().window(), close vs quit |
| P11_AlertHandling | Simple alert, confirm (accept/dismiss), prompt with sendKeys |
| P12_ScrollingActions | scrollBy, scrollTo top/bottom via JavascriptExecutor on Flipkart |
| P13_Screenshots | TakesScreenshot, full-page screenshots of IRCTC, Flipkart, Amazon |
| P14_CookieHandling | getCookies, addCookie, getCookieNamed, deleteCookie, deleteAll |

### Locators
| File | Topic |
|------|-------|
| P15_LocatorById | By.id() - Facebook login form (email, pass, loginbutton) |
| P16_LocatorByName | By.name() - Google search box, IRCTC login fields |
| P17_LocatorByClassName | By.className() - Amazon and Flipkart elements |
| P18_LocatorByTagName | By.tagName() - all links, images, inputs on Amazon, Flipkart |
| P19_LocatorByLinkText | By.linkText() and By.partialLinkText() - IRCTC, Amazon, Flipkart |
| P20_LocatorByXPath | By.xpath() - relative, attribute, text(), contains(), axes on Facebook, Amazon |
| P21_LocatorByCSSSelector | By.cssSelector() - #id, .class, tag[attr] on Facebook, Instagram, Amazon |
