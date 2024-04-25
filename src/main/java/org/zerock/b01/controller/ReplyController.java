package org.zerock.b01.controller;

import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.b01.dto.Member;
import org.zerock.b01.dto.ReplyDTO;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/replies")
@Log4j2
public class ReplyController {

    @PostMapping("/test")
    public void test(){
        log.info("test");
    }

    @PostMapping("/test2")
    public void test2(int num){
        log.info("num");
    }

    @PostMapping("/test3")
    public void test3(Member member){
        log.info(member);
    }

    @PostMapping("/test4")
    public Map<String,Member> test4(@RequestBody  Member member){
        Map<String,Member> map = new HashMap<>();
        map.put("member1: ",member);
        log.info(member);

        return map;
    }

    @PostMapping(value = "/test5",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Map<String,Member> test5(@RequestBody  Member member){
        Map<String,Member> map = new HashMap<>();
        map.put("member1: ",member);
        log.info(member);

        return map;
    }


    @ApiOperation(value = "Replies POST", notes = "Post 방식으로 댓글 등록")
    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE) //해당 메소드를 받아서 소비(consume)하는 데이터가 어떤 종류인지 명시, JSON 데이터 타입을 처리하는 메소드
    public ResponseEntity<Map<String,Long>> register(@RequestBody ReplyDTO replyDTO){
        //@RequestBody는 JSON 문자열을 ReplyDTO로 변환

        Map<String,Long> resultMap = new HashMap<>();
        resultMap=Map.of("rno",111L);
        //resultMap.put("replyDTO",replyDTO.getBno());

        log.info("replyDTO: "+replyDTO);

        return ResponseEntity.ok(resultMap);

    }

}
