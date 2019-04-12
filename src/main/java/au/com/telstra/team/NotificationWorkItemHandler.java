package au.com.telstra.team;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;
import org.springframework.stereotype.Component;

@Component("Notification")
public class NotificationWorkItemHandler implements WorkItemHandler {
    @Override
    public void executeWorkItem(WorkItem workItem, WorkItemManager workItemManager) {

        // extract parameters
        String from = (String) workItem.getParameter("From");
        String to = (String) workItem.getParameter("To");
        String message = (String) workItem.getParameter("Message");
        String priority = (String) workItem.getParameter("Priority");

        System.out.println("NotificationWorkItemHandler log: " + from + " " + to + " " + message + " " + priority);

        // notify manager that work item has been completed
        workItemManager.completeWorkItem(workItem.getId(), null);

    }
    @Override
    public void abortWorkItem(WorkItem workItem, WorkItemManager workItemManager) {

    }
}
