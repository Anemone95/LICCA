package top.anemone.cloneDetection;

import java.util.List;

import top.anemone.datastructures.result.Results;
import ecst.ECSTree;

public interface CloneDetective {
	 
	Results detectClones(List<ECSTree> compilationUnits);

}
