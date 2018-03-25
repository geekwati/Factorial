<html>
<body>
	<h1> Factorial of your value</h1>
	<p>
		<%
			String inp=""+request.getAttribute("input");
			String res=""+request.getAttribute("answer");
			out.print("Factorial of "+inp+"= "+res);
		%>
</body>
</html>