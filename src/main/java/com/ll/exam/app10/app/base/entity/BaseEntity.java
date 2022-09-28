package com.ll.exam.app10.app.base.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

import static javax.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PROTECTED;

@Getter
@SuperBuilder
@MappedSuperclass // 상속용 엔티티 클래스에 붙이는 어노테이션
@NoArgsConstructor(access = PROTECTED)
@EntityListeners(AuditingEntityListener.class) // 자동으로 생성날자와 수정 날자를 localdatetime.now 없이 해준다.
@ToString
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @CreatedDate
    private LocalDateTime createDate;
    @LastModifiedDate
    private LocalDateTime modifyDate;
}
