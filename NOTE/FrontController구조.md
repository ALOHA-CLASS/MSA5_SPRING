
request --->   FrontController 
                 ---> URL ?
	/board/list.do	     	BoardListController		    /board/list.jsp
	/board/read.do		    BoardReadController	        /board/read.jsp
	/board/insert.do		BoardInsertController	    /board/insert.jsp
	/board/insertPro.do		BoardInsertProController	/board/list.jsp	(redirect)
	/board/update.do		BoardUpdateController	    /board/update.jsp
	/board/updatePro.do	    BoardUpdateProController	/board/list.jsp	(redirect)
	/board/deletePro.do	    BoardDeleteController	    /board/list.jsp	(redirect)
