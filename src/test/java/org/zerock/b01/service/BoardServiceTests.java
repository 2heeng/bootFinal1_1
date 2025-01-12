package org.zerock.b01.service;


import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.b01.domain.Board;
import org.zerock.b01.dto.BoardDTO;
import org.zerock.b01.dto.PageRequestDTO;
import org.zerock.b01.dto.PageResponseDTO;

import java.util.stream.IntStream;

@SpringBootTest
@Log4j2
public class BoardServiceTests {
//    @Autowired
//    private BoardService boardService;

//    @Test
//    public void testRegister() {
//        IntStream.rangeClosed(1,100).forEach(i -> {
//            BoardDTO boardDTO = BoardDTO.builder()
//                    .title("Sample Title..."+i)
//                    .content("Sample Content..."+i)
//                    .writer("user0"+(i%10))
//                    .build();
//
//            Long bno = boardService.register(boardDTO);
//
//            log.info("bno: " + bno);
//        });
//
//        log.info(boardService.getClass().getName());

//        BoardDTO boardDTO = BoardDTO.builder()
//                .title("Sample Title...")
//                .content("Sample Content...")
//                .writer("user00")
//                .build();
//
//        Long bno = boardService.register(boardDTO);
//
//        log.info("bno: " + bno);
//    }
//
//
//    @Test
//    public void testModify() {
//
//        //변경에 필요한 데이터만#
//        BoardDTO boardDTO = BoardDTO.builder()
//                .bno(101L)
//                .title("Updated....101")
//                .content("Updated content 101...")
//                .build();
//
//        boardService.modify(boardDTO);
//
//    }
//
//    @Test
//    public void testList() {
//
//        PageRequestDTO pageRequestDTO = PageRequestDTO.builder()
//                .type("tcw")
//                .keyword("짬뽕")
//                .page(1)
//                .size(10)
//                .build();
//
//        PageResponseDTO<BoardDTO> responseDTO = boardService.list(pageRequestDTO);
//
//        log.info(responseDTO);
//
//    }
}
