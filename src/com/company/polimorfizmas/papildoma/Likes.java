package com.company.polimorfizmas.papildoma;

import java.util.List;

public interface Likes {
    void likes(PersonImpl receiver);
    int howManyLikesDoesThisBranchOfQualificationHave(PersonImpl personImpl, List<PersonImpl> list);
    void setLikeCount();
    int getLikeCount();

}
