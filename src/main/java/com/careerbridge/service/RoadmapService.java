package com.careerbridge.service;
import com.careerbridge.dto.SkillGap;import org.springframework.stereotype.Service;import java.util.*;
@Service public class RoadmapService { public List<String> createRoadmap(List<SkillGap> gaps){List<String> roadmap=new ArrayList<>();for(SkillGap g:gaps)if(g.gap()>0)roadmap.add("Learn "+g.skill()+" (gap "+g.gap()+", priority "+g.importance()+")");return roadmap;} }
