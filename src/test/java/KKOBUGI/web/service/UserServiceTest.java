package KKOBUGI.web.service;

import KKOBUGI.web.controller.UserController;
import KKOBUGI.web.domain.entity.User;
import KKOBUGI.web.exception.DuplicateUserException;
import KKOBUGI.web.exception.FindNoUserException;
import KKOBUGI.web.exception.NoUserIdException;
import KKOBUGI.web.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class UserServiceTest {
    @Autowired
    UserService userService;

    @Test
    public void userId로_찾기() throws Exception{
        User user = new User("id11","pw1","닉네임11");
        userService.save(user);
        User findUser = userService.findOne(user.getId());

        assertEquals(findUser.getId(), user.getId());
    }


    @Test(expected = DuplicateUserException.class)
    public void 중복검증() throws Exception{
        User user1 = new User("id1","pw1","짱구");
        userService.save(user1);
        User user2 = new User("id2","pw1","짱구");
        userService.duplicateCheck(user2.getLogin_Id(), user2.getNickname());

        fail("닉네임 중복!");
    }


    @Test(expected = NoUserIdException.class)
    public void 없는_회원을_조회() throws Exception{
        User findUser = userService.findOne(123L);
        fail("없는 유저입니다.");
    }

    @Test(expected = NoUserIdException.class)
    public void 유저_삭제() throws Exception{
        User user = new User("id1","pw1","짱구");
        // 유저 저장
        userService.save(user);

        // 유저 삭제
        userService.delete(user);

        User findUser = userService.findByloginId("id1");
        fail("없는 유저를 조회");
    }

    @Test
    public void 유저정보_수정() throws Exception{

    }
}
