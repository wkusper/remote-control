package edu.iu.habahram.remotecontroller.repository;

import edu.iu.habahram.remotecontroller.model.Device;

import java.util.List;

public interface IRemoteLoader {
    void setup(List<Device> devices);

    void onButtonWasPushed(int slot);

}
