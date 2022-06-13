(ns mathbox.components.draw.line)

"*Draw lines*

:blending `\\\"normal\\\"` (blending) - Blending mode ('no, normal, add, subtract, multiply)
:classes `[]` (string array) - Custom classes, e.g. `[\\\"big\\\"]`
:closed `false` (bool) - Close line
:color `\\\"rgb(128, 128, 128)\\\"` (color) - Color
:colors `null` (nullable select) - Colors data source, e.g. `\\\"#colors\\\"`
:depth `1` (number) - Depth scaling
:end `true` (bool) - Draw end arrow
:id `null` (nullable string) - Unique ID, e.g. `\\\"sampler\\\"`
:opacity `1` (positive number) - Opacity
:points `<` (select) - Points data source
:proximity `null` (nullable number) - Proximity threshold, e.g. `10`
:size `3` (number) - Arrow size
:start `true` (bool) - Draw start arrow
:stroke `\\\"solid\\\"` (stroke) - Line stroke (solid, dotted, dashed)
:visible `true` (bool) - Visibility for rendering
:width `2` (positive number) - Line width
:zBias `0` (positive number) - Z-Bias (3D stacking)
:zIndex `0` (positive int) - Z-Index (2D stacking)
:zOrder `null` (nullable number) - Z-Order (drawing order), e.g. `2`
:zTest `true` (bool) - Test Z buffer
:zWrite `true` (bool) - Write Z buffer"
