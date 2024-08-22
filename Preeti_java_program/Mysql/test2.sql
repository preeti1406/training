Declare
     E employees%rowtype;
Begin
   select first_name,employee_id into E.first_name,E.employee_id from employees where employee_id=&no;
   dbms_output.put_line(E.first_name||' '||E.employee_id);
Exception When No_Data_Found Then
   dbms_output.put_line('Records(s) Not Found');
End;
/