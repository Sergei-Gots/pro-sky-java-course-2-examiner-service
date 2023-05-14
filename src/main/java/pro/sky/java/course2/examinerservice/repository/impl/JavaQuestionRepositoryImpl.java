package pro.sky.java.course2.examinerservice.repository.impl;

import developer_tools.QuestionUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashSet;


@Repository
@Component("JavaQuestionRepository")
public class JavaQuestionRepositoryImpl extends AbstractQuestionRepositoryImpl {

    @Override
    @PostConstruct
    protected void initQuestions() {
        setQuestions(new HashSet<>(QuestionUtils.initJavaQuestions()));
    }
}
