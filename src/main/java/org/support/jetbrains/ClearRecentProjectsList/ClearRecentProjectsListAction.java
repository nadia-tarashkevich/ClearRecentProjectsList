package org.support.jetbrains.ClearRecentProjectsList;

import com.intellij.icons.AllIcons;
import com.intellij.ide.RecentProjectsManager;
import com.intellij.ide.RecentProjectsManagerBase;
import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static com.intellij.openapi.ui.MessageConstants.YES;

public class ClearRecentProjectsListAction extends AnAction {
    final String NAME="Clear all project history";
    final String REALLY_WANT = "Do you really want to clear list of all projects?";
    final String SUCCESS="Project history is now empty";

    @Override
    public void actionPerformed(@NotNull AnActionEvent anActionEvent) {

        throw new RuntimeException("Condition is not met");/*
        int amSure = Messages.showYesNoDialog(REALLY_WANT,
                NAME,
                AllIcons.Actions.DeleteTag);

        if (amSure == YES) {
            RecentProjectsManagerBase recentProjectsManager = (RecentProjectsManagerBase) RecentProjectsManager.getInstance();
            List<String> recentPaths = recentProjectsManager.getRecentPaths();
            for (String recentPath : recentPaths) {
                recentProjectsManager.removePath(recentPath);
            }
            String groupId = NAME;

            // Create the notification
            Notification notification = new Notification(
                    groupId,
                    NAME,
                    SUCCESS,
                    NotificationType.INFORMATION
            );

            // Show the notification
            Notifications.Bus.notify(notification, anActionEvent.getProject());
        }*/

    }
}