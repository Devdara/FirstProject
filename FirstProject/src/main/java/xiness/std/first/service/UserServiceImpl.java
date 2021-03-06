package xiness.std.first.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import xiness.std.first.dao.UserMapper;
import xiness.std.first.vo.UserVO;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<UserVO> selectAllUser() {
		System.out.println("UserServiceImpl클래스 selectAllUser()호출");
		return userMapper.selectAllUser();
	}

	@Override
	public List<UserVO> selectAdmin(String sName) {
		return userMapper.selectAdmin(sName);
	}

	@Override
	public int insertId(String id) {
		return userMapper.insertId(id);
	}
	
	

}//