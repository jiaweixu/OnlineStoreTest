# IS2545 DELIVERABLE 3: Web Testing 
## Jiawei XU (jix20)

The challenge in this project is:</br>
<ol> 
<li>WebDriver problem:</br></li>
For selenium 3, gecko driver is needed. And different version of browser and Selenium may give different results.
</br>

<Li>Gherkin version problem:</br></li>
The lastest verion of Gherkin (2.12.4) on its webpage is not the bottom-most version (2.9.3).
Without the newest version, there is an error: "java.lang.NoClassDefFoundError: gherkin/lexer/Encoding".
</br>

<Li>Assert deprecated problem:</br></li>
Not using junit.framework.Assert but org.junit.Assert can resolve this problem
</br>

<Li>click a button then need to wait until the next page is ready:</br></li>
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-64")));
</br>

<Li>click a button then need to wait 5 seconds:</br></li>
		thread.sleep(5000);
</br>


2. Testing results:</br>
![TestResult1](https://github.com/jiaweixu/OnlineStoreTest/tree/master/Materials/Test_result1.png "Testing Results")
![TestResult2](https://github.com/jiaweixu/OnlineStoreTest/tree/master/Materials/Test_result1.png "Testing Results")
</br>
