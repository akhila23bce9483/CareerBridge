package com.careerbridge.service;
import com.careerbridge.dto.SkillGap;import com.careerbridge.model.*;import java.util.*;import org.springframework.stereotype.Service;
@Service public class SkillGapService {
 public List<SkillGap> analyze(User user,Role role){Map<String,Integer> levels=new HashMap<>();for(Skill s:user.getSkills())levels.put(s.getName().toLowerCase(),3);List<SkillGap> gaps=new ArrayList<>();for(Skill s:role.getSkills()){int have=levels.getOrDefault(s.getName().toLowerCase(),0);int required=3;int gap=Math.max(0,required-have);gaps.add(new SkillGap(s.getName(),have,required,3,gap,gap*3.0));}gaps.sort(Comparator.comparingDouble(SkillGap::weightedGap).reversed());return gaps;}
 public double matchPercent(List<SkillGap> gaps){if(gaps.isEmpty())return 100;double total=gaps.stream().mapToDouble(g->g.requiredLevel()*g.importance()).sum();double missing=gaps.stream().mapToDouble(SkillGap::weightedGap).sum();return Math.round(Math.max(0,100-(missing/total*100))*10)/10.0;}
}
