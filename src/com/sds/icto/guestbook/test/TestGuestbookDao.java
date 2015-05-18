package com.sds.icto.guestbook.test;

import java.util.List;

import com.sds.icto.guestbook.dao.GuestbookDao;
import com.sds.icto.guestbook.vo.GuestbookVo;

public class TestGuestbookDao {
	public static void main(String[] args) {
		try {
			testInsert();
			testDelete();
			testFetchList();
		} catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
	
	public static void testInsert()
		throws Exception {
		GuestbookDao dao = new GuestbookDao();
		
		GuestbookVo vo = new GuestbookVo();
		vo.setName( "둘리" );
		vo.setPassword( "1234" );
		vo.setMessage( "호이~" );
		dao.insert(vo);
		
		vo = new GuestbookVo();
		vo.setName( "마이콜" );
		vo.setPassword( "1234" );
		vo.setMessage( "구공탄~ 라면~" );
		dao.insert(vo);
	}

	public static void testFetchList()
		throws Exception {
		GuestbookDao dao = new GuestbookDao();
		
		List<GuestbookVo> list = dao.fetchList();
		for( GuestbookVo vo : list ) {
			System.out.print( vo.getNo() + ":");
			System.out.print( vo.getName() + ":");
			System.out.print( vo.getPassword() + ":");
			System.out.print( vo.getMessage() + ":");
			System.out.print( vo.getRegDate() + ":");
			System.out.print( "\n");
		}
	}	
	public static void testDelete()
		throws Exception {
		GuestbookDao dao = new GuestbookDao();

		GuestbookVo vo = new GuestbookVo(); 
		vo.setNo( 16L );
		vo.setPassword( "1234" );
		dao.delete( vo );
		
		vo = new GuestbookVo(); 
		vo.setNo( 17L );
		vo.setPassword( "1234" );
		dao.delete( vo );
	}
}