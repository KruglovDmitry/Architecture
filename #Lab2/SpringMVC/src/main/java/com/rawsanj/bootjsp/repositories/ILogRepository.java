package com.rawsanj.bootjsp.repositories;

import com.rawsanj.bootjsp.domain.Log;
import java.util.List;

public interface ILogRepository {

    List<Log> getAll();

    Log get(int id);

    void add(Log log);
}