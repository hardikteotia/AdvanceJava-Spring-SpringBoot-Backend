<%@page language="java" %>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    </body>
        <h2>Hardy Calculator</h2>

         <form action="add">
                <h2>Result is: <%= session.getAttribute("result") %></h2>
                <h2>Result is: ${result}</h2>
            </form>

    </body>
</html>