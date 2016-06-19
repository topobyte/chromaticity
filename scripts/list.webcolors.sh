#!/bin/bash

DIR=$(dirname $0)
CMD="$DIR/chromaticity.sh"
CLASS="de.topobyte.chromaticity.ListWebColors"

exec "$CMD" "$CLASS" "$@"
