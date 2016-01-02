<html>
<body>

    <h2>Jersey RESTful Web Application!</h2>

    <p>
        <a href="api/resource/hello">Hello ACBook</a>
    </p>
    <p>
        <a href="api/resource/expense">Weekly Expense</a>
    </p>
    <form action="api/resource/expense" method="POST">
        <input type="hidden" name="_method" value="PUT" />
        <input type="submit" value="Create Expenses" />
    </form>
    <p>
        <a href="api/resource/income">Monthly Income</a>
    </p>

    <p>
        Visit <a href="http://jersey.java.net" target="_blank">Project Jersey website</a> for more information on Jersey!
    </p>

</body>
</html>
