package com.ferio.Buggy.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@RequiredArgsConstructor
@Table(name = "buggy_user")
public class User extends Base{

}
