create database employeedetail;

 select ename,sal from employeedetail.empl where sal>=2200;

 select * from employeedetail.empl where comm is NULL OR comm=0;
 select ename,sal from employeedetail.empl where sal>=2500 and sal<=4000;
select ename,job,sal from employeedetail.empl where job !='MANAGER';
 
select ename from employeedetail.empl where ename like '%t';
  
select ename from employeedetail.empl where ename like '--A%';



