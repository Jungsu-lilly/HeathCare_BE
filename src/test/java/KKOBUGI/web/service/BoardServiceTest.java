package KKOBUGI.web.service;

import KKOBUGI.web.domain.entity.Board;
import KKOBUGI.web.domain.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import javax.transaction.Transactional;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebMvcTest
@Transactional
public class BoardServiceTest {
    @Autowired
    BoardService boardService;
    @Autowired
    private MockMvc mvc;
    @Autowired
    UserService userService;

    @Test
    public void board_전체게시판_조회() throws Exception{
        mvc.perform(get("/board"))
                .andExpect(status().isOk());
    }
}