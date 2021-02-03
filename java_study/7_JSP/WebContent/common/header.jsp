<header>
       <hgroup>
		   <h1 class="ff">Page Title</h1> 
		   <h2> Page SubTitle</h2>
		</hgroup>
	 </header>	
	 
		<nav id="nmenu">
		   <ul>
		      <li> <a href="index.jsp">Home</a></li>
		      <li> <a href="#">Tutorials</a></li>
		      <li> <a href="#">About</a></li>
		      
		      <c:if test="${empty login}">
		      <li> <a href="login.jsp">Login</a></li>
		      </c:if>
		      <c:if test="${!empty login}">
		      <li> <a href="logout.do">Logout(${login.name})</a></li>
		      </c:if>
		   </ul>
		</nav>