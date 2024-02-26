package edu.iu.habahram.remotecontroller.repository;

import edu.iu.habahram.remotecontroller.model.DeviceData;

import java.util.List;

public interface IRemoteLoader {
    void setup(int id, List<DeviceData> devices);

    String onButtonWasPushed(int id, int slot);
    String offButtonWasPushed(int id, int slot);

}
