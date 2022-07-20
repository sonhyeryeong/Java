select hello("혜령");
call usp_countBooks;
call usp_findbytitle('책1', @count); 

select @count;

call usp_selectTable('persons');

call usp_loop(10);
