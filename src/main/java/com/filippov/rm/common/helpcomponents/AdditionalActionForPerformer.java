package com.filippov.rm.common.helpcomponents;

import com.filippov.rm.common.interfaces.AdditionalAction;
import org.springframework.stereotype.Component;

@Component
public class AdditionalActionForPerformer implements AdditionalAction {

    @Override
    public void performAdditionalAction() {

        System.out.println("It's a back flip because I can");
    }
}
