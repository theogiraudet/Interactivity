package org.eclipse.sirius.components.collaborative.interactivity.services;

import org.eclipse.sirius.components.core.api.IImagePathService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImagePathService implements IImagePathService {
    @Override
    public List<String> getPaths() {
        return List.of("/images");
    }
}
