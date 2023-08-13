package emu.grasscutter.game.quest.content;

import emu.grasscutter.data.excels.quest.QuestData;
import emu.grasscutter.game.quest.*;
import emu.grasscutter.game.quest.enums.QuestContent;

@QuestValueContent(QuestContent.QUEST_CONTENT_FINISH_ITEM_GIVING)
public final class ContentFinishGivingItem extends BaseContent {
    @Override
    public boolean execute(GameQuest quest, QuestData.QuestContentCondition condition, String paramStr, int... params) {
        var giveAction = quest.getOwner()
            .getPlayerProgress()
            .getItemGivings()
            .get(condition.getParam()[0]);
        return giveAction != null && giveAction.isFinished();
    }
}
