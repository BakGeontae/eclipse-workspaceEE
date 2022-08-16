/**************** 회원*********************/
--회원상세보기
select userid,password,name,email from userinfo where userid='guard1';
--회원수알아내기
select count(*) as cnt  from userinfo where userid='xxx';
--회원수정
update userinfo set password='111',name='김변경',email='change@fmail.com' where userid='guard1';
--회원탈퇴
delete from userinfo where userid='guard1';
/**************** 제품********************/
--제품리스트
select * from product;
--제품상세보기
select * from product where p_no=1;
--제품수정(X)
--제품삭제(X)

/**************** 카트********************/

--로그인한 guard1 멤버한사람의 카트아이템리스트
select * from cart where userid='guard1';
--cart+product
select * from cart c join product p on c.p_no=p.p_no where c.userid='guard1';

--update

--로그인한 guard1 님의  카트에 제품번호1번 존재여부(0:insert , 1:update)
select count(*) product_count from cart where userid='guard1' and p_no=1;
--guard1 카트에 있는 1번제품의 수량증가
update cart set cart_qty=cart_qty+2 where userid='guard1'  and p_no = 1;

--guard1 카트에 있는 cart_no 1번의 수량3개 수정
update cart set cart_qty=3 where userid='guard1'  and cart_no = 1;
--guard1님 카트아이템1개삭제
delete from cart where cart_no = 1;
--guard1님 카트아이템모두삭제
delete from cart where userid='guard1';

/****************주문********************/
--로그인한멤버(guard1)님의 주문목록
select * from orders where userid='guard1';
--로그인한멤버(guard1)님의 주문(orders)전체목록(orderitem,product)
select * from 
    orders o 
    join order_item oi on o.o_no=oi.o_no 
    join product p on oi.p_no=p.p_no 
where o.userid='guard1';


--로그인한멤버(guard1)님의 주문번호[2,4,5,6]
select o_no from orders where userid='guard1';
--로그인한멤버(guard1)님의 주문(orders)한개(orderitem,product)의상세
select * from 
    orders o 
    join order_item oi on o.o_no=oi.o_no 
    join product p on oi.p_no=p.p_no 
where o.userid='guard1' and o.o_no=2;

--로그인한멤버 주문한개삭제( on delete cascade)
delete from orders where o_no=1;
--로그인한멤버 주문전체삭제( on delete cascade)
delete from orders where userid='guard1';















