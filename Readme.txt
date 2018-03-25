1) create a webapp that calculate factorial of any no. using String because int and long can't hold big numbers
2) first create index.html(static page) that takes input from user, value whose factorial is to be calculated
3) user click on submit button then server goes to CalculateServlet (CONTROLLER)
	i) form submit button goes with form action that has uri calculate
	ii) web container(here we use we logic) of web server match a servlet name from web.xml(deployment descriptor) file using url-pattern, servlet-name and servlet-mapping tags.
	iii) web container creates a thread for servlet if it launches already otherwise launches servlet itself(in case of first time). Anyhow servlet named CalculateServlet gets started
4) servlet calls FactorialOfNumber.calculateFactorial() method from POJO(Plain old java object) that is MODEL
5) It returns the result as a String 
6) we set some attribute in request object for JSP in servlet
7) creates an object of RequestDispatcher class and initialise it with Jsp file name using getRequestDispatcher() calling it via request object
8) call include() with request and response its argument with Requestdispatcher object 
9) In Jsp (VIEW), display your result by including java in html(dynamic page) in scriplet tag <%   %>

